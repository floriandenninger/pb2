package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjy extends aonm implements aooz {
    public static final avjy a;
    private static volatile aopf i;
    public aqyg b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aulq g;
    public boolean h;
    private int j;
    private byte k = 2;

    static {
        avjy avjyVar = new avjy();
        a = avjyVar;
        aonm.registerDefaultInstance(avjy.class, avjyVar);
    }

    private avjy() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avjy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avjy.class) {
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
