package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asph extends aonm implements aooz {
    public static final asph a;
    private static volatile aopf i;
    public int b;
    public arfs d;
    public aott f;
    public boolean g;
    private aota j;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public aomf h = aomf.b;

    static {
        asph asphVar = new asph();
        a = asphVar;
        aonm.registerDefaultInstance(asph.class, asphVar);
    }

    private asph() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asph();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (asph.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
