package com.klef.jfds.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Insert Vehicle
            Car car = new Car();
            car.setName("tata");
            car.setType("Car");
            car.setMaxSpeed(100);
            car.setColor("greem");
            car.setNumberOfDoors(6);

            Truck truck = new Truck();
            truck.setName(" Truck");
            truck.setType("Truck");
            truck.setMaxSpeed(100);
            truck.setColor("Blue");
            truck.setLoadCapacity(10000);

            session.persist(car);
            session.persist(truck);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        System.out.println("Records inserted successfully!");
    }
}