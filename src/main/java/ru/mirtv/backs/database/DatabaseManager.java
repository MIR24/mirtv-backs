package ru.mirtv.backs.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.persistence.HibernateUtil;

public class DatabaseManager {
	
	public Background addBackground(Background background) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(background);
		session.beginTransaction().commit();
		session.close();
		return background;
	}

	public List<Background> getBackgrounds() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.createCriteria(Background.class).list();
		return null;
	}

	public static Map<Integer, Banner> getBanners() {
		return null;
	}

}
