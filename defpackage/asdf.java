package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdf extends aonm implements aooz {
    public static final asdf a;
    private static volatile aopf j;
    public int b;
    public arnb c;
    public avuc d;
    public apvb g;
    public asdj h;
    public awaf i;
    private byte k = 2;
    public String e = "";
    public int f = 1;

    static {
        asdf asdfVar = new asdf();
        a = asdfVar;
        aonm.registerDefaultInstance(asdf.class, asdfVar);
    }

    private asdf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\bဉ\u0007\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", asaq.i, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asdf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asdf.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
