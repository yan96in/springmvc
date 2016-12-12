/**
 * 
 */
package springmvc.chapter01.bean;

import java.io.Serializable;

/**
 * @author yan96in
 *
 */
public class Product implements Serializable {
		private static final long serivalVersionUID=743984394L;
		private String name;
		private String description;
		private float price;
		public Product() {
		}
		public Product(String name, String description, float price) {
			this.name = name;
			this.description = description;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
}
