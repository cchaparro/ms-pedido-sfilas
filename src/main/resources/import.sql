/* Populate tables providers */
INSERT INTO db.providers (description, logo, mail, name) VALUES('sandwich qbano', 'sandwichqbano.logo', 'servicioalcliente@sandwichcubano.com', 'sandwich qbano');


/* Populate tables queues */
INSERT INTO db.queues (description, provider_id) VALUES('Cola general', 1);

/* Populate tables clients */
INSERT INTO db.clients (telephone, mail, name, last_name ) VALUES('3013486253', 'ca.chaparro@hotmail.com', 'Cristian','Chaparro');

/* Populate tables queues */
INSERT INTO db.products (name, description,value, provider_id ) VALUES('Sandwich Clasico', 'sandwich con queso y jamon', 259990,1 );
