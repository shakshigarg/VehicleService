package com.vehicle.service.service;

import com.vehicle.service.dao.VehicleDao;
import com.vehicle.service.dao.VehicleDaoImpl;
import com.vehicle.service.dao.VehicleDaoImplTwo;
import com.vehicle.service.models.BookingStrategy;

public class VehicleDaoImplFactory {
    public VehicleDao getVehicleDaoImpl(String dbName){
        switch (dbName){
            case "Mysql":
                return new VehicleDaoImplTwo();
            case "Inmem":
                return new VehicleDaoImpl();
        }
        return null;

    }
}
