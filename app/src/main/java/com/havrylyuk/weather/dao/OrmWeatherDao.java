package com.havrylyuk.weather.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ORM_WEATHER".
*/
public class OrmWeatherDao extends AbstractDao<OrmWeather, Long> {

    public static final String TABLENAME = "ORM_WEATHER";

    /**
     * Properties of entity OrmWeather.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property City_id = new Property(1, Long.class, "city_id", false, "CITY_ID");
        public final static Property City_name = new Property(2, String.class, "city_name", false, "CITY_NAME");
        public final static Property Dt = new Property(3, java.util.Date.class, "dt", false, "DT");
        public final static Property Temp = new Property(4, Double.class, "temp", false, "TEMP");
        public final static Property Temp_min = new Property(5, Double.class, "temp_min", false, "TEMP_MIN");
        public final static Property Temp_max = new Property(6, Double.class, "temp_max", false, "TEMP_MAX");
        public final static Property Pressure = new Property(7, Double.class, "pressure", false, "PRESSURE");
        public final static Property Humidity = new Property(8, Integer.class, "humidity", false, "HUMIDITY");
        public final static Property Clouds = new Property(9, Integer.class, "clouds", false, "CLOUDS");
        public final static Property Wind_speed = new Property(10, Double.class, "wind_speed", false, "WIND_SPEED");
        public final static Property Wind_dir = new Property(11, String.class, "wind_dir", false, "WIND_DIR");
        public final static Property Rain = new Property(12, Integer.class, "rain", false, "RAIN");
        public final static Property Snow = new Property(13, Integer.class, "snow", false, "SNOW");
        public final static Property Icon = new Property(14, String.class, "icon", false, "ICON");
        public final static Property Condition_code = new Property(15, Integer.class, "condition_code", false, "CONDITION_CODE");
        public final static Property Condition_text = new Property(16, String.class, "condition_text", false, "CONDITION_TEXT");
        public final static Property Is_day = new Property(17, Boolean.class, "is_day", false, "IS_DAY");
    }


    public OrmWeatherDao(DaoConfig config) {
        super(config);
    }
    
    public OrmWeatherDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ORM_WEATHER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"CITY_ID\" INTEGER," + // 1: city_id
                "\"CITY_NAME\" TEXT," + // 2: city_name
                "\"DT\" INTEGER," + // 3: dt
                "\"TEMP\" REAL," + // 4: temp
                "\"TEMP_MIN\" REAL," + // 5: temp_min
                "\"TEMP_MAX\" REAL," + // 6: temp_max
                "\"PRESSURE\" REAL," + // 7: pressure
                "\"HUMIDITY\" INTEGER," + // 8: humidity
                "\"CLOUDS\" INTEGER," + // 9: clouds
                "\"WIND_SPEED\" REAL," + // 10: wind_speed
                "\"WIND_DIR\" TEXT," + // 11: wind_dir
                "\"RAIN\" INTEGER," + // 12: rain
                "\"SNOW\" INTEGER," + // 13: snow
                "\"ICON\" TEXT," + // 14: icon
                "\"CONDITION_CODE\" INTEGER," + // 15: condition_code
                "\"CONDITION_TEXT\" TEXT," + // 16: condition_text
                "\"IS_DAY\" INTEGER);"); // 17: is_day
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ORM_WEATHER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, OrmWeather entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long city_id = entity.getCity_id();
        if (city_id != null) {
            stmt.bindLong(2, city_id);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(3, city_name);
        }
 
        java.util.Date dt = entity.getDt();
        if (dt != null) {
            stmt.bindLong(4, dt.getTime());
        }
 
        Double temp = entity.getTemp();
        if (temp != null) {
            stmt.bindDouble(5, temp);
        }
 
        Double temp_min = entity.getTemp_min();
        if (temp_min != null) {
            stmt.bindDouble(6, temp_min);
        }
 
        Double temp_max = entity.getTemp_max();
        if (temp_max != null) {
            stmt.bindDouble(7, temp_max);
        }
 
        Double pressure = entity.getPressure();
        if (pressure != null) {
            stmt.bindDouble(8, pressure);
        }
 
        Integer humidity = entity.getHumidity();
        if (humidity != null) {
            stmt.bindLong(9, humidity);
        }
 
        Integer clouds = entity.getClouds();
        if (clouds != null) {
            stmt.bindLong(10, clouds);
        }
 
        Double wind_speed = entity.getWind_speed();
        if (wind_speed != null) {
            stmt.bindDouble(11, wind_speed);
        }
 
        String wind_dir = entity.getWind_dir();
        if (wind_dir != null) {
            stmt.bindString(12, wind_dir);
        }
 
        Integer rain = entity.getRain();
        if (rain != null) {
            stmt.bindLong(13, rain);
        }
 
        Integer snow = entity.getSnow();
        if (snow != null) {
            stmt.bindLong(14, snow);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(15, icon);
        }
 
        Integer condition_code = entity.getCondition_code();
        if (condition_code != null) {
            stmt.bindLong(16, condition_code);
        }
 
        String condition_text = entity.getCondition_text();
        if (condition_text != null) {
            stmt.bindString(17, condition_text);
        }
 
        Boolean is_day = entity.getIs_day();
        if (is_day != null) {
            stmt.bindLong(18, is_day ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, OrmWeather entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long city_id = entity.getCity_id();
        if (city_id != null) {
            stmt.bindLong(2, city_id);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(3, city_name);
        }
 
        java.util.Date dt = entity.getDt();
        if (dt != null) {
            stmt.bindLong(4, dt.getTime());
        }
 
        Double temp = entity.getTemp();
        if (temp != null) {
            stmt.bindDouble(5, temp);
        }
 
        Double temp_min = entity.getTemp_min();
        if (temp_min != null) {
            stmt.bindDouble(6, temp_min);
        }
 
        Double temp_max = entity.getTemp_max();
        if (temp_max != null) {
            stmt.bindDouble(7, temp_max);
        }
 
        Double pressure = entity.getPressure();
        if (pressure != null) {
            stmt.bindDouble(8, pressure);
        }
 
        Integer humidity = entity.getHumidity();
        if (humidity != null) {
            stmt.bindLong(9, humidity);
        }
 
        Integer clouds = entity.getClouds();
        if (clouds != null) {
            stmt.bindLong(10, clouds);
        }
 
        Double wind_speed = entity.getWind_speed();
        if (wind_speed != null) {
            stmt.bindDouble(11, wind_speed);
        }
 
        String wind_dir = entity.getWind_dir();
        if (wind_dir != null) {
            stmt.bindString(12, wind_dir);
        }
 
        Integer rain = entity.getRain();
        if (rain != null) {
            stmt.bindLong(13, rain);
        }
 
        Integer snow = entity.getSnow();
        if (snow != null) {
            stmt.bindLong(14, snow);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(15, icon);
        }
 
        Integer condition_code = entity.getCondition_code();
        if (condition_code != null) {
            stmt.bindLong(16, condition_code);
        }
 
        String condition_text = entity.getCondition_text();
        if (condition_text != null) {
            stmt.bindString(17, condition_text);
        }
 
        Boolean is_day = entity.getIs_day();
        if (is_day != null) {
            stmt.bindLong(18, is_day ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset) ? null : cursor.getLong(offset);
    }    

    @Override
    public OrmWeather readEntity(Cursor cursor, int offset) {
        OrmWeather entity = new OrmWeather( //
            cursor.isNull(offset) ? null : cursor.getLong(offset), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // city_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // city_name
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // dt
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // temp
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // temp_min
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // temp_max
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // pressure
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // humidity
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // clouds
            cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10), // wind_speed
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // wind_dir
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // rain
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // snow
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // icon
            cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15), // condition_code
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // condition_text
            cursor.isNull(offset + 17) ? null : cursor.getShort(offset + 17) != 0 // is_day
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, OrmWeather entity, int offset) {
        entity.setId(cursor.isNull(offset) ? null : cursor.getLong(offset));
        entity.setCity_id(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setCity_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDt(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setTemp(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setTemp_min(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setTemp_max(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setPressure(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setHumidity(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setClouds(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setWind_speed(cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10));
        entity.setWind_dir(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRain(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setSnow(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setIcon(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCondition_code(cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15));
        entity.setCondition_text(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setIs_day(cursor.isNull(offset + 17) ? null : cursor.getShort(offset + 17) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(OrmWeather entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(OrmWeather entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(OrmWeather entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
