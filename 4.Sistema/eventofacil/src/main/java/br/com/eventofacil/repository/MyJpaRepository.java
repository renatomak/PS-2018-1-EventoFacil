package br.com.eventofacil.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import br.com.eventofacil.model.Entidade;

@NoRepositoryBean
public interface MyJpaRepository<T extends Entidade> extends JpaRepository<T, Long> {
	
    /** 
	 * Instancia a gravação da role no banco
	 */
    @Transactional
    @Modifying
    @Query(value = "insert into Role values ('ROLE_ADMIN')", nativeQuery = true)
    void insertRole();
    
    /** 
	 * Instancia a gravação da usuário no banco
	 */
    @Transactional
    @Modifying
    @Query(value = "insert into Usuario (email, nome, senha) values ('admin@admin.com.br', 'Administrador', '$2a$04$qP517gz1KNVEJUTCkUQCY.JzEoXzHFjLAhPQjrg5iP6Z/UmWjvUhq')", nativeQuery = true)
    void insertUsuario();
    
    /** 
	 * Instancia a gravação da relação da role com o usuário no banco
	 */
    @Transactional
    @Modifying
    @Query(value = "insert into Usuario_Role(Usuario_email, roles_nome) values ('admin@admin.com.br', 'ROLE_ADMIN')", nativeQuery = true)
    void insertUsuarioRole();
}
