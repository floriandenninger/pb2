package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfs extends aonm implements aooz {
    public static final asfs a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfs asfsVar = new asfs();
        a = asfsVar;
        aonm.registerDefaultInstance(asfs.class, asfsVar);
    }

    private asfs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ\uebde⸒\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000\uf437Ἳᐼ\u0000\ue3a1ⴵᐼ\u0000\uebde⸒ᐼ\u0000", new Object[]{"c", "b", aqdt.class, awhq.class, awhr.class, atcq.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asfs.class) {
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
