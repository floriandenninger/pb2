package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnj extends aonh implements aoni {
    public static final aqnj a;
    private static volatile aopf e;
    public long b;
    public boolean c;
    public boolean d;
    private int f;
    private byte g = 2;

    static {
        aqnj aqnjVar = new aqnj();
        a = aqnjVar;
        aonm.registerDefaultInstance(aqnj.class, aqnjVar);
    }

    private aqnj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqnj.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
