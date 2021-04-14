public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("start");

        if (i<0)
        throw new BizException("error : i < 0");
        System.out.println("end");
    }
    
}
