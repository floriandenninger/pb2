package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arit extends aonm implements aooz {
    public static final arit a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arit aritVar = new arit();
        a = aritVar;
        aonm.registerDefaultInstance(arit.class, aritVar);
    }

    private arit() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0000\uf61f༩\uec93怉\t\u0000\u0000\u0007\uf61f༩ြ\u0000\ue18fᝊᐼ\u0000ﵡᵙᐼ\u0000\ue67dḘᐼ\u0000\ue5be⡱ᐼ\u0000諾⡱ြ\u0000\uf09c⢠ᐼ\u0000\ueb1d䃦ᐼ\u0000\uec93怉ᐼ\u0000", new Object[]{"c", "b", avvh.class, awaw.class, avvy.class, arym.class, aowc.class, aqxo.class, avbm.class, aoxi.class, aoxd.class});
            case NEW_MUTABLE_INSTANCE:
                return new arit();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arit.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
