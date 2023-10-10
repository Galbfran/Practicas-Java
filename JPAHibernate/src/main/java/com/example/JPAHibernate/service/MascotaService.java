package com.example.JPAHibernate.service;

import com.example.JPAHibernate.model.Mascota;
import com.example.JPAHibernate.model.Persona;
import com.example.JPAHibernate.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotasService{

    @Autowired
    private IMascotaRepository repoMasco;


    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = repoMasco.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota masco = repoMasco.findById(id_mascota).orElse(null);
        return masco;
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota masco = this.findMascota(idOriginal);

        masco.setId_mascota(id_mascotaNueva);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);

        this.saveMascota(masco);


    }
}
