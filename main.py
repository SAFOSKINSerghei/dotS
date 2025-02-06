from sklearn.linear_model import LinearRegression
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split

datas = pd.read_csv("data.csv")


def safos_linear_regression(data):
    x = pd.DataFrame(datas['x'])
    y = pd.DataFrame(datas['y'])
    x_tr, x_ts, y_tr, y_ts = train_test_split(x, y, test_size=0.2)
    l_model = LinearRegression()
    l_model.fit(x_tr, y_tr)
    b = l_model.intercept_
    scores = l_model.coef_
    y_pr = l_model.predict(np.array([[1]]))
    print(y_pr)
