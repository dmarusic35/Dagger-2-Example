package co.infinum.pokemon.dagger.components;

import co.infinum.pokemon.activities.PokemonListActivity;
import co.infinum.pokemon.dagger.modules.NetworkModule;
import dagger.Component;
import co.infinum.pokemon.dagger.modules.PokemonListModule;

/**
 * Created by dino on 12/05/15.
 */
@Component(modules = {
        NetworkModule.class,
        PokemonListModule.class
})
public interface PokemonListComponent {

    void inject(PokemonListActivity activity);
}
