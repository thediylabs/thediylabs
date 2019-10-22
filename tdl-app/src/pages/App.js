import React from 'react';

import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Landing from './Landing/Landing';
import Products from './Products/Products';

const App = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/" component={Landing} />
        <Route exact path="/products" component={Products} />
      </Switch>
    </BrowserRouter>
  );
};

export default App;
