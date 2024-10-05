package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzv extends aonm implements aooz {
    public static final arzv a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public arzt d;
    public apxf e;
    public long f;
    private byte i = 2;
    public String g = "";

    static {
        arzv arzvVar = new arzv();
        a = arzvVar;
        aonm.registerDefaultInstance(arzv.class, arzvVar);
    }

    private arzv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arzv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arzv.class) {
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
