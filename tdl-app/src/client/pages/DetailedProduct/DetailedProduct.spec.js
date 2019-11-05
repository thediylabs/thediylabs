import React from 'react';
import renderer from 'react-test-renderer';

import DetailedProduct from './DetailedProduct';

describe('DetailedProduct', () => {
    it('renders correctly', () => {
        const tree = renderer
          .create(<DetailedProduct />)
          .toJSON();
        expect(tree).toMatchSnapshot();
      });
});
