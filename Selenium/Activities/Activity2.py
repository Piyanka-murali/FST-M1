
from selenium import webdriver
from selenium.webdriver.common.by import By

# Launch browser
driver = webdriver.Firefox()

# Open the login page
driver.get("https://training-support.net/webelements/login-form/")

# Print page title
print("Page title is:", driver.title)

# Enter username
driver.find_element(By.ID, "username").send_keys("admin")

# Enter password
driver.find_element(By.ID, "password").send_keys("password")

# Click login button
driver.find_element(By.XPATH, "//button[text()='Submit']").click()

# Close browser
driver.quit()