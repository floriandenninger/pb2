package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aquf extends aonm implements aooz {
    public static final aquf a;
    private static volatile aopf h;
    public int b;
    public int d;
    public aqua e;
    public aqug f;
    public aque g;
    private byte i = 2;
    public String c = "";

    static {
        aquf aqufVar = new aquf();
        a = aqufVar;
        aonm.registerDefaultInstance(aquf.class, aqufVar);
    }

    private aquf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0003\u0004ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", aqtk.o, "f", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aquf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aquf.class) {
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
