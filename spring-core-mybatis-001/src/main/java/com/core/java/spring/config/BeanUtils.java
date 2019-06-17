package com.core.java.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The Class BeanUtils.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/17 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.config </BR>
 * BeanUtils.java </BR>
 */
public class BeanUtils {

	/** The instance. */
	private volatile static BeanUtils instance;

	/**
	 * Instantiates a new bean utils.
	 */
	private BeanUtils() {
	}

	public static BeanUtils getInstance() {
		if (null == BeanUtils.instance) {
			synchronized (BeanUtils.class) {
				BeanUtils.instance = new BeanUtils();
			}
		}
		return BeanUtils.instance;
	}

	private ApplicationContext getContext() {
		final ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		return appContext;
	}

	/**
	 * Gets the bean.
	 *
	 * @param beanType the bean type
	 * @return the bean
	 */
	public static Object getBean(final Bean beanType) {
		Object obj = null;
		switch (beanType) {
		case DEPARTMENT_SERVICE:
			obj = BeanUtils.getInstance().getContext().getBean(BeanName.DEPARTMENT_SERVICE_IMPL);
			break;
		case EMPLOYEEMENT_SERVICE:
			obj = BeanUtils.getInstance().getContext().getBean(BeanName.EMPLOYEE_SERVICE_IMPL);
			break;
		}
		return obj;
	}
}