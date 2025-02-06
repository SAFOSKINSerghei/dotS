from  dotS.ml import *
import pandas as pd
import numpy as np


datas = pd.read_csv("lr_datas.csv")
x = pd.DataFrame(datas['x'])
y = pd.DataFrame(datas['y'])
lr_class = DotSLinearRegression(x, y, 0.2)
print(lr_class.get_predict([1]))

lr_class.load_model('test_model_2')
print(lr_class.get_predict([1, 59, 117, 175]))
