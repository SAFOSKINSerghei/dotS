from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from joblib import dump, load
import numpy as np
import pandas as pd


class DotSLinearRegression:

    def __init__(self, x=None, y=None, test_size=0.1):
        self.l_model = LinearRegression()
        try:
            self.test_size = test_size
            self.x_tr, self.x_ts, self.y_tr, self.y_ts = train_test_split(x, y, test_size=test_size)
            self.l_model.fit(self.x_tr, self.y_tr)
        except:
            pass

    def change_dataset(self, x, y, test_size):
        self.test_size = test_size
        self.x_tr, self.x_ts, self.y_tr, self.y_ts = train_test_split(x, y, test_size=test_size)
        self.l_model.fit(self.x_tr, self.y_tr)

    def get_fitted_model(self):
        return self.l_model

    def get_b(self):
        return self.l_model.intercept_[0]

    def get_xs(self):
        return pd.DataFrame(self.l_model.coef_)

    def get_predict(self, x):
        return self.l_model.predict([x])[0][0]

    def save_model(self, file_name):
        dump(self.l_model, file_name)

    def load_model(self, file_name):
        self.test_size = None
        self.x_tr = self.x_ts = self.y_tr = self.y_ts = None
        self.l_model = load(file_name)
        return self.l_model
