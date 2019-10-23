import React from 'react';

import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Landing from './Landing/Landing';
import Products from './Products/Products';
import DetailedProduct from './DetailedProduct';

const App = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/" component={Landing} />
        <Route exact path="/products" component={Products} />
        <Route exact path="/detailedProduct" component={DetailedProduct} />
      </Switch>
    </BrowserRouter>
  );
};

export default App;
