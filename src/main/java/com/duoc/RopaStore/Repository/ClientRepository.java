package com.duoc.RopaStore.Repository;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.RopaStore.Model.Client;

// public interface ClientRepository extends JpaRepository<Client, Long> {
// }

@Repository
public class ClientRepository {

    private final List<Client> clients = new ArrayList<>();

    public List<Client> findAll() {
        return clients;
    }

    public boolean save(Client client) {
        return clients.add(client);
    }

}
