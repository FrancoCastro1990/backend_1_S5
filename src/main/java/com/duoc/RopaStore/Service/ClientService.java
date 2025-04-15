package com.duoc.RopaStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.RopaStore.Model.Client;
import com.duoc.RopaStore.Repository.ClientRepository;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAllClients() {
        List<Client> clients = clientRepository.findAll();
        clients.sort((c1, c2) -> c1.getId().compareTo(c2.getId()));
        return clients;
    }

    public boolean createClient(Client client) {
        List<Client> clients = clientRepository.findAll();
        for (Client existingClient : clients) {
            if (existingClient.getId().equals(client.getId())) {
                return false; 
            }
        }
        return clientRepository.save(client);
    }

}
