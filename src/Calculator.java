/**
 * Created by stasgordienko on 13.04.16.
 * ����� ��������� ������� �����������. ���������, ������ ���������, ������� ���������.
 */
public class Calculator {

    private int result;

    /**
     ��������� ���������
     */
    public void add(int ... params){
        for(Integer p : params){
            this.result += p;
        }
    }

    /**
     ������ ���������
     */
    public int getResult(){
        return this.result;
    }

    /**
     ������� ���������
     */
    public cleanResult(){
        this.result = 0;
    }
}
