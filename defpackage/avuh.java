package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avuh extends aonm implements aooz {
    public static final avuh a;
    private static volatile aopf g;
    public int b;
    public int c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    private aqyg h;
    private apxf i;
    private aqyg j;
    private atva k;
    private atva l;
    private byte m = 2;

    static {
        avuh avuhVar = new avuh();
        a = avuhVar;
        aonm.registerDefaultInstance(avuh.class, avuhVar);
    }

    private avuh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001ဌ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\t\bᐉ\u0007\nᐉ\u0005", new Object[]{"b", "c", avts.c, "d", "e", "f", "i", "k", "l", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avuh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avuh.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
