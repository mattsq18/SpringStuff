package com.genspark.RESTfulAPITest2.Service;

import com.genspark.RESTfulAPITest2.Entity.*;
import java.util.List;

public interface MyService {
    List<Clubs> getClubs();

    Clubs getClubFromName(String name);
    Clubs addClub(Clubs club);
    Clubs setClub(Clubs club);
    String removeClub(String name);

}
