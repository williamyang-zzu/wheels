package wheels;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SysdateGet {
	/**
	 * 测试结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String time ="2017-04-10 12:35:27";
        System.out.println(judgeThisMon(time));
	}
	//判断前台获取时间是否是当月 yangpj
	public static boolean judgeThisMon(String date) {
		String timeFromFore = date;//前台获取的时间
        timeFromFore = timeFromFore.substring(0,4) + timeFromFore.substring(5,7);
        SimpleDateFormat sysdateF = new SimpleDateFormat("yyyyMM");
        String sysdate = sysdateF.format(new Date());//系统当前时间
		if (timeFromFore.equals(sysdate)) {
			return true;
		}
		return false;
	}

}
