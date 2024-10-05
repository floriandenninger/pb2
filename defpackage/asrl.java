package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrl extends aonm implements aooz {
    public static final asrl a;
    private static volatile aopf h;
    public aqyg b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    private byte j = 2;

    static {
        asrl asrlVar = new asrl();
        a = asrlVar;
        aonm.registerDefaultInstance(asrl.class, asrlVar);
    }

    private asrl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asrl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asrl.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
