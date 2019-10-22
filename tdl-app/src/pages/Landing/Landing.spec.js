import React from 'react';
import renderer from 'react-test-renderer';

import { MemoryRouter } from 'react-router-dom'

import Landing from './Landing';

describe('Landing', () => {
    it('renders correctly', () => {
        const tree = renderer
          .create(
              <MemoryRouter>
                  <Landing />
              </MemoryRouter>
          )
          .toJSON();
        expect(tree).toMatchSnapshot();
      });
});
