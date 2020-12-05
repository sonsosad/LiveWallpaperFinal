package son.dev.app.livewallpaper.database.source;

import java.util.List;

import io.reactivex.Flowable;
import son.dev.app.livewallpaper.database.Recents;

public interface IRecentsDataSource {

    Flowable<List<Recents>> getAllRecents();

    void insertRecents(Recents... recents);
    void updateRecents(Recents... recents);
    void deleteRecents(Recents... recents);

    void deleteAllRecents();

}
