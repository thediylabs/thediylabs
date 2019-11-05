import React from 'react';
import renderer from 'react-test-renderer';

import { MemoryRouter } from 'react-router-dom'

import ProductTile from './ProductTile';

describe('ProductTile', () => {
  let productDetails;

  beforeEach(() => {
    productDetails = {
      productCode: '2',
      productName: 'Super Amazing Awsome Cake',
      sellerName: 'Gordon Ramsay',
      productPrice: '$123.45',
      images: 'a',
      productDescription: 'This cake is super duper amazing!'
    };
  });

  it('renders correctly', () => {
    const tree = renderer
      .create(
        <MemoryRouter>
          <ProductTile productDetails/>
        </MemoryRouter>
      )
      .toJSON();
    expect(tree).toMatchSnapshot();
  });
});
