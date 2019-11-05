import React from 'react';
import renderer from 'react-test-renderer';

import ApplicationBar from './ApplicationBar';

describe('ApplicationBar', () => {
    it('renders correctly', () => {
        const tree = renderer
          .create(<ApplicationBar />)
          .toJSON();
        expect(tree).toMatchSnapshot();
      });
});
