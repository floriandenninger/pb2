package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplv extends aonm implements aooz {
    public static final aplv a;
    private static volatile aopf c;
    public aplu b;
    private int d;
    private apls e;
    private byte f = 2;

    static {
        aplv aplvVar = new aplv();
        a = aplvVar;
        aonm.registerDefaultInstance(aplv.class, aplvVar);
    }

    private aplv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf733䖢\ue98d䙇\u0002\u0000\u0000\u0001\uf733䖢ဉ\u0002\ue98d䙇ᐉ\u0003", new Object[]{"d", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aplv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aplv.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
