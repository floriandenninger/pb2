package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum argo implements aonq {
    IN_APP_UPDATE_EVENT_TYPE_UNKNOWN(0),
    IN_APP_UPDATE_EVENT_TYPE_STARTED(1),
    IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_AVAILABLE(2),
    IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_NOT_AVAILABLE(3),
    IN_APP_UPDATE_EVENT_TYPE_GET_INFO_FAILED(4),
    IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_OK(11),
    IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_FAILED(12),
    IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_OK(13),
    IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_CANCELED(14),
    IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_FAILED(15),
    IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_PENDING(5),
    IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADING(6),
    IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED(7),
    IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_FAILED(8),
    IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_CANCELED(9),
    IN_APP_UPDATE_EVENT_TYPE_USER_COMPLETE_UPDATE(10);

    public final int q;

    argo(int i) {
        this.q = i;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
