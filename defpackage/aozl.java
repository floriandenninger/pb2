package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozl extends aonm implements aooz {
    public static final aozl a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private apmh l;
    private aota m;
    private byte n = 2;

    static {
        aozl aozlVar = new aozl();
        a = aozlVar;
        aonm.registerDefaultInstance(aozl.class, aozlVar);
    }

    private aozl() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\bᐉ\t\tᐉ\u0002\nᐉ\u0003\fᐉ\u000b\rᐉ\u0004", new Object[]{"c", "d", "e", "i", "j", "k", "l", "f", "g", "m", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aozl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aozl.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
