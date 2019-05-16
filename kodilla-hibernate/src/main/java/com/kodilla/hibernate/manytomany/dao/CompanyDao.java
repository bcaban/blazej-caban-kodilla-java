package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends JpaRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> searchByFirstThreeLetters(@Param("COMPANY_NAME") String name);

    List<Company> searchByFragmentCompanyName(@Param("NAME") String name);

}
