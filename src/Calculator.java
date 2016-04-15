/**
 * Created by stasgordienko on 13.04.16.
 * ����� ��������� ������� �����������. ���������, ������ ���������, ������� ���������.
 */
public class Calculator {

    private Double result;

    /**
     ��������� ���������
     */
    public void add(Double ... params){
        for(Double p : params){
            this.result += p;
        }
    }

    /**
     ������ ���������
     */
    public Double getResult(){
        return this.result;
    }

    /**
     ������� ���������
     */
    public void cleanResult(){
        this.result = 0D;
    }
}
