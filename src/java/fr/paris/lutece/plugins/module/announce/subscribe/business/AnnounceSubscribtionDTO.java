package fr.paris.lutece.plugins.module.announce.subscribe.business;

import fr.paris.lutece.plugins.subscribe.business.Subscription;

public class AnnounceSubscribtionDTO extends Subscription {

    String _strEmailSubscribes;

    public AnnounceSubscribtionDTO(){
    }

    public AnnounceSubscribtionDTO(String _strEmailSubscribes){
        super();
        this._strEmailSubscribes = _strEmailSubscribes;
    }

    public String getEmailSubscribes() {
        return _strEmailSubscribes;
    }

    public void setEmailSubscribes(String _strEmailSubscribes) {
        this._strEmailSubscribes = _strEmailSubscribes;
    }

}
