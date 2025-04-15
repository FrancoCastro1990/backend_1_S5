package com.duoc.RopaStore.Service;

import java.util.List;

import com.duoc.RopaStore.Model.Client;

public interface IClientService {
    public List<Client> findAllClients();
    public boolean createClient(Client client);
}
