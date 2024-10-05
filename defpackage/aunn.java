package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aunn extends aonh implements aoni {
    public static final aunn a;
    private static volatile aopf i;
    public int b;
    public aunq e;
    public auno g;
    public boolean h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        aunn aunnVar = new aunn();
        a = aunnVar;
        aonm.registerDefaultInstance(aunn.class, aunnVar);
    }

    private aunn() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u000bဇ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aunn();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aunn.class) {
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
