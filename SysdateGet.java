package wheels;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SysdateGet {
	/**
	 * ���Խ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String time ="2017-04-10 12:35:27";
        System.out.println(judgeThisMon(time));
	}
	//�ж�ǰ̨��ȡʱ���Ƿ��ǵ��� yangpj
	public static boolean judgeThisMon(String date) {
		String timeFromFore = date;//ǰ̨��ȡ��ʱ��
        timeFromFore = timeFromFore.substring(0,4) + timeFromFore.substring(5,7);
        SimpleDateFormat sysdateF = new SimpleDateFormat("yyyyMM");
        String sysdate = sysdateF.format(new Date());//ϵͳ��ǰʱ��
		if (timeFromFore.equals(sysdate)) {
			return true;
		}
		return false;
	}

}
