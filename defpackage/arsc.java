package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsc extends aonm implements aooz {
    public static final arsc a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public int d;
    public aryo e;
    public boolean g;
    private byte i = 2;
    public String f = "";

    static {
        arsc arscVar = new arsc();
        a = arscVar;
        aonm.registerDefaultInstance(arsc.class, arscVar);
    }

    private arsc() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဌ\u0001", new Object[]{"b", "c", "e", "f", "g", "d", aujj.j});
            case NEW_MUTABLE_INSTANCE:
                return new arsc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arsc.class) {
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
