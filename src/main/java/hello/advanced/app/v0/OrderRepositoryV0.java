package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId){
        //저장 로직
        if (itemId.equals("ex")){
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000); //상품 저장하는 데 걸리는 시간(가상)
    }

    private void sleep(int millis) {
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
