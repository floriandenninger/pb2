package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujv extends aonm implements aooz {
    public static final aujv a;
    private static volatile aopf f;
    public int b;
    public avgg c;
    public aqyg d;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public String e = "";

    static {
        aujv aujvVar = new aujv();
        a = aujvVar;
        aonm.registerDefaultInstance(aujv.class, aujvVar);
    }

    private aujv() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "g", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aujv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aujv.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
