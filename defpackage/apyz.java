package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apyz extends aonm implements aooz {
    public static final apyz a;
    private static volatile aopf j;
    public int b;
    public aqyg d;
    public boolean f;
    public aqyg g;
    public int h;
    public apxf i;
    private byte k = 2;
    public String c = "";
    public String e = "";

    static {
        apyz apyzVar = new apyz();
        a = apyzVar;
        aonm.registerDefaultInstance(apyz.class, apyzVar);
    }

    private apyz() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apyz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apyz.class) {
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
