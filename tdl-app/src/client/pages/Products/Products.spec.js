import React from 'react';
import renderer from 'react-test-renderer';

import { MemoryRouter } from 'react-router-dom'

import Products from './Products';

describe('Products', () => {
    it('renders correctly', () => {
        const tree = renderer
          .create(
              <MemoryRouter>
                  <Products />
              </MemoryRouter>
          )
          .toJSON();
        expect(tree).toMatchSnapshot();
      });
});
