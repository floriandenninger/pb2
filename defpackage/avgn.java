package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgn extends aonm implements aooz {
    public static final avgn a;
    private static volatile aopf n;
    public int b;
    public apxf i;
    private aota o;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public aomf m = aomf.b;

    static {
        avgn avgnVar = new avgn();
        a = avgnVar;
        aonm.registerDefaultInstance(avgn.class, avgnVar);
    }

    private avgn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\u0002\u0001ဈ\u0000\u0006ဈ\u000b\u0007ဈ\f\tဈ\u0011\nᐉ\u0013\u000bည\u0014\fဈ\u0006\rᐉ\b\u000eဈ\u0003\u000fဈ\u0004\u0015ဈ\u0001\u0016ဈ\u0007", new Object[]{"b", "c", "j", "k", "l", "o", "m", "g", "i", "e", "f", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avgn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (avgn.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
