package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atuk extends aonm implements aooz {
    public static final atuk a;
    private static volatile aopf c;
    public atuf b;
    private int d;
    private byte e = 2;

    static {
        atuk atukVar = new atuk();
        a = atukVar;
        aonm.registerDefaultInstance(atuk.class, atukVar);
    }

    private atuk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf114㻀\uf114㻀\u0001\u0000\u0000\u0001\uf114㻀ᐉ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new atuk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atuk.class) {
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
