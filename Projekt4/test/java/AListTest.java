import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Objects;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

   class AListTest {

  @Mock
  private Biblotek biblotek;


  private AList aList ;

  @Test

  void removeExistingBok(){
    Bok bok = new Bok("Boken","123");
    when(biblotek.queryBok("Boken")).thenReturn(bok);
    when(biblotek.removeBok(bok)).thenReturn(true);

    AList.removeBok("Boken", biblotek);



    verify(biblotek, times(1)).removeBok(bok);



  }







  }



















        // Bok bok = new Bok("hej", "2");
        // Biblotek bibloteket = new Biblotek();





        //  bibloteket.addNewBok(bok);



        //  bibloteket.removeBok(bok);



        //  assertEquals(0, bibloteket.findBok(bok));




        // Biblotek bibloteket = mock(Biblotek.class);

        // Bok bok = new Bok("hej", "2");




