import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    
    public BirdStatus birdStatus;
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        setPaintOrder(Bird.class,BirdStatus.class,Wall.class);
    }
    
    public MazeWorld(BirdStatus stat) {
        super(800, 600, 1);
        birdStatus = new BirdStatus(stat,this);
        prepare();
        setPaintOrder(Bird.class,BirdStatus.class,Wall.class,Bird.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        if(birdStatus==null) birdStatus = new BirdStatus(this);
        addObject(birdStatus,14,587);
        birdStatus.setLocation(381,9);
        birdStatus.drawLives();

        Bird bird = new Bird(birdStatus);
        addObject(bird,405,301);

        makeWalls();

        Wall wall106 = new Wall();
        addObject(wall106,625,369);
        Wall wall107 = new Wall();
        addObject(wall107,607,369);
        Wall wall108 = new Wall();
        addObject(wall108,589,369);
        Wall wall109 = new Wall();
        addObject(wall109,571,368);
        Wall wall110 = new Wall();
        addObject(wall110,571,351);
        Wall wall111 = new Wall();
        addObject(wall111,571,333);
        Wall wall112 = new Wall();
        addObject(wall112,588,333);
        Wall wall113 = new Wall();
        addObject(wall113,606,332);
        Wall wall114 = new Wall();
        addObject(wall114,625,333);
        Wall wall115 = new Wall();
        addObject(wall115,643,333);
        Wall wall116 = new Wall();
        addObject(wall116,625,225);
        Wall wall117 = new Wall();
        addObject(wall117,606,225);
        Wall wall118 = new Wall();
        addObject(wall118,588,224);
        Wall wall119 = new Wall();
        addObject(wall119,571,225);
        Wall wall120 = new Wall();
        addObject(wall120,570,243);
        Wall wall121 = new Wall();
        addObject(wall121,570,260);
        Wall wall122 = new Wall();
        addObject(wall122,570,277);
        Wall wall123 = new Wall();
        addObject(wall123,589,278);
        Wall wall124 = new Wall();
        addObject(wall124,607,278);
        Wall wall125 = new Wall();
        addObject(wall125,624,278);
        Wall wall126 = new Wall();
        addObject(wall126,643,278);
        Wall wall127 = new Wall();
        addObject(wall127,408,66);
        Wall wall128 = new Wall();
        addObject(wall128,408,82);
        Wall wall129 = new Wall();
        addObject(wall129,408,98);
        Wall wall130 = new Wall();
        addObject(wall130,408,114);
        Wall wall131 = new Wall();
        addObject(wall131,306,173);
        Wall wall132 = new Wall();
        addObject(wall132,306,190);
        Wall wall133 = new Wall();
        addObject(wall133,307,206);
        Wall wall134 = new Wall();
        addObject(wall134,307,223);
        Wall wall135 = new Wall();
        addObject(wall135,307,239);
        Wall wall136 = new Wall();
        addObject(wall136,307,257);
        Wall wall137 = new Wall();
        addObject(wall137,307,276);
        Wall wall138 = new Wall();
        addObject(wall138,323,222);
        Wall wall139 = new Wall();
        addObject(wall139,341,222);
        Wall wall140 = new Wall();
        addObject(wall140,359,222);
        Wall wall141 = new Wall();
        addObject(wall141,460,223);
        Wall wall142 = new Wall();
        addObject(wall142,477,223);
        Wall wall143 = new Wall();
        addObject(wall143,498,223);
        Wall wall144 = new Wall();
        addObject(wall144,509,223);
        Wall wall145 = new Wall();
        addObject(wall145,511,209);
        Wall wall146 = new Wall();
        addObject(wall146,511,194);
        Wall wall147 = new Wall();
        addObject(wall147,511,179);
        Wall wall148 = new Wall();
        addObject(wall148,509,239);
        Wall wall149 = new Wall();
        addObject(wall149,510,255);
        Wall wall150 = new Wall();
        addObject(wall150,511,270);
        Wall wall151 = new Wall();
        addObject(wall151,512,326);
        Wall wall152 = new Wall();
        addObject(wall152,512,341);
        Wall wall153 = new Wall();
        addObject(wall153,512,357);
        Wall wall154 = new Wall();
        addObject(wall154,512,372);
        Wall wall155 = new Wall();
        addObject(wall155,305,327);
        Wall wall156 = new Wall();
        addObject(wall156,305,344);
        Wall wall157 = new Wall();
        addObject(wall157,305,359);
        Wall wall158 = new Wall();
        addObject(wall158,305,375);
        Wall wall159 = new Wall();
        addObject(wall159,357,170);
        Wall wall160 = new Wall();
        addObject(wall160,374,169);
        Wall wall161 = new Wall();
        addObject(wall161,392,170);
        Wall wall162 = new Wall();
        addObject(wall162,411,170);
        Wall wall163 = new Wall();
        addObject(wall163,431,170);
        Wall wall164 = new Wall();
        addObject(wall164,448,170);
        Wall wall165 = new Wall();
        addObject(wall165,463,170);
        Wall wall166 = new Wall();
        addObject(wall166,410,187);
        Wall wall167 = new Wall();
        addObject(wall167,410,203);
        Wall wall168 = new Wall();
        addObject(wall168,410,220);
        Wall wall169 = new Wall();
        addObject(wall169,358,377);
        Wall wall170 = new Wall();
        addObject(wall170,374,377);
        Wall wall171 = new Wall();
        addObject(wall171,389,377);
        Wall wall172 = new Wall();
        addObject(wall172,407,377);
        Wall wall173 = new Wall();
        addObject(wall173,424,378);
        Wall wall174 = new Wall();
        addObject(wall174,440,378);
        Wall wall175 = new Wall();
        addObject(wall175,457,378);
        Wall wall176 = new Wall();
        addObject(wall176,409,395);
        Wall wall177 = new Wall();
        addObject(wall177,409,413);
        Wall wall178 = new Wall();
        addObject(wall178,409,428);
        Wall wall179 = new Wall();
        addObject(wall179,560,171);
        Wall wall180 = new Wall();
        addObject(wall180,577,171);
        Wall wall181 = new Wall();
        addObject(wall181,594,171);
        Wall wall182 = new Wall();
        addObject(wall182,220,171);
        Wall wall183 = new Wall();
        addObject(wall183,237,171);
        Wall wall184 = new Wall();
        addObject(wall184,254,171);
        Wall wall185 = new Wall();
        addObject(wall185,308,428);
        Wall wall186 = new Wall();
        addObject(wall186,325,428);
        Wall wall187 = new Wall();
        addObject(wall187,341,429);
        Wall wall188 = new Wall();
        addObject(wall188,357,429);
        Wall wall189 = new Wall();
        addObject(wall189,458,428);
        Wall wall190 = new Wall();
        addObject(wall190,474,428);
        Wall wall191 = new Wall();
        addObject(wall191,488,428);
        Wall wall192 = new Wall();
        addObject(wall192,504,428);
        Wall wall193 = new Wall();
        addObject(wall193,222,100);
        Wall wall194 = new Wall();
        addObject(wall194,239,100);
        Wall wall195 = new Wall();
        addObject(wall195,255,100);
        Wall wall196 = new Wall();
        addObject(wall196,255,119);
        Wall wall197 = new Wall();
        addObject(wall197,236,119);
        Wall wall198 = new Wall();
        addObject(wall198,221,118);
        Wall wall199 = new Wall();
        addObject(wall199,306,102);
        Wall wall200 = new Wall();
        addObject(wall200,323,102);
        Wall wall201 = new Wall();
        addObject(wall201,341,102);
        Wall wall202 = new Wall();
        addObject(wall202,357,102);
        Wall wall203 = new Wall();
        addObject(wall203,357,118);
        Wall wall204 = new Wall();
        addObject(wall204,339,118);
        Wall wall205 = new Wall();
        addObject(wall205,324,118);
        Wall wall206 = new Wall();
        addObject(wall206,306,118);
        Wall wall207 = new Wall();
        addObject(wall207,221,429);
        Wall wall208 = new Wall();
        addObject(wall208,238,429);
        Wall wall209 = new Wall();
        addObject(wall209,254,429);
        Wall wall210 = new Wall();
        addObject(wall210,253,446);
        Wall wall211 = new Wall();
        addObject(wall211,253,460);
        Wall wall212 = new Wall();
        addObject(wall212,253,477);
        Wall wall213 = new Wall();
        addObject(wall213,564,431);
        Wall wall214 = new Wall();
        addObject(wall214,581,430);
        Wall wall215 = new Wall();
        addObject(wall215,596,430);
        Wall wall216 = new Wall();
        addObject(wall216,564,447);
        Wall wall217 = new Wall();
        addObject(wall217,564,464);
        Wall wall218 = new Wall();
        addObject(wall218,564,479);
        Wall wall219 = new Wall();
        addObject(wall219,628,480);
        Wall wall220 = new Wall();
        addObject(wall220,613,480);
        Wall wall221 = new Wall();
        addObject(wall221,190,480);
        Wall wall222 = new Wall();
        addObject(wall222,203,480);
        Wall wall223 = new Wall();
        addObject(wall223,460,101);
        Wall wall224 = new Wall();
        addObject(wall224,478,101);
        Wall wall225 = new Wall();
        addObject(wall225,496,101);
        Wall wall226 = new Wall();
        addObject(wall226,510,100);
        Wall wall227 = new Wall();
        addObject(wall227,459,118);
        Wall wall228 = new Wall();
        addObject(wall228,477,118);
        Wall wall229 = new Wall();
        addObject(wall229,494,117);
        Wall wall230 = new Wall();
        addObject(wall230,512,117);
        Wall wall231 = new Wall();
        addObject(wall231,562,98);
        Wall wall232 = new Wall();
        addObject(wall232,579,98);
        Wall wall233 = new Wall();
        addObject(wall233,596,98);
        Wall wall234 = new Wall();
        addObject(wall234,596,118);
        Wall wall235 = new Wall();
        addObject(wall235,580,118);
        Wall wall236 = new Wall();
        addObject(wall236,564,118);
        Wall wall237 = new Wall();
        addObject(wall237,257,325);
        Wall wall238 = new Wall();
        addObject(wall238,257,343);
        Wall wall239 = new Wall();
        addObject(wall239,257,361);
        Wall wall240 = new Wall();
        addObject(wall240,256,379);
        Wall wall241 = new Wall();
        addObject(wall241,224,380);
        Wall wall242 = new Wall();
        addObject(wall242,204,380);
        Wall wall243 = new Wall();
        addObject(wall243,187,380);
        Wall wall244 = new Wall();
        addObject(wall244,242,380);
        Wall wall245 = new Wall();
        addObject(wall245,210,324);
        Wall wall246 = new Wall();
        addObject(wall246,192,324);
        Wall wall247 = new Wall();
        addObject(wall247,191,283);
        Wall wall248 = new Wall();
        addObject(wall248,209,283);
        Wall wall249 = new Wall();
        addObject(wall249,229,283);
        Wall wall250 = new Wall();
        addObject(wall250,244,283);
        Wall wall251 = new Wall();
        addObject(wall251,257,283);
        Wall wall252 = new Wall();
        addObject(wall252,192,220);
        Wall wall253 = new Wall();
        addObject(wall253,209,220);
        Wall wall254 = new Wall();
        addObject(wall254,259,221);
        Wall wall255 = new Wall();
        addObject(wall255,259,239);
        Wall wall256 = new Wall();
        addObject(wall256,259,262);
        Wall wall257 = new Wall();
        addObject(wall257,306,480);
        Wall wall258 = new Wall();
        addObject(wall258,306,497);
        Wall wall259 = new Wall();
        addObject(wall259,306,512);
        Wall wall260 = new Wall();
        addObject(wall260,306,530);
        Wall wall261 = new Wall();
        addObject(wall261,323,530);
        Wall wall262 = new Wall();
        addObject(wall262,340,530);
        Wall wall263 = new Wall();
        addObject(wall263,356,530);
        Wall wall264 = new Wall();
        addObject(wall264,289,530);
        Wall wall265 = new Wall();
        addObject(wall265,269,530);
        Wall wall266 = new Wall();
        addObject(wall266,252,530);
        Wall wall267 = new Wall();
        addObject(wall267,234,530);
        Wall wall268 = new Wall();
        addObject(wall268,358,478);
        Wall wall269 = new Wall();
        addObject(wall269,374,477);
        Wall wall270 = new Wall();
        addObject(wall270,391,479);
        Wall wall271 = new Wall();
        addObject(wall271,407,481);
        Wall wall272 = new Wall();
        addObject(wall272,426,480);
        Wall wall273 = new Wall();
        addObject(wall273,443,480);
        Wall wall274 = new Wall();
        addObject(wall274,460,480);
        Wall wall275 = new Wall();
        addObject(wall275,409,498);
        Wall wall276 = new Wall();
        addObject(wall276,408,514);
        Wall wall277 = new Wall();
        addObject(wall277,409,530);
        Wall wall278 = new Wall();
        addObject(wall278,220,530);
        Wall wall279 = new Wall();
        addObject(wall279,460,530);
        Wall wall280 = new Wall();
        addObject(wall280,478,530);
        Wall wall281 = new Wall();
        addObject(wall281,495,530);
        Wall wall282 = new Wall();
        addObject(wall282,512,530);
        Wall wall283 = new Wall();
        addObject(wall283,528,530);
        Wall wall284 = new Wall();
        addObject(wall284,547,530);
        Wall wall285 = new Wall();
        addObject(wall285,564,530);
        Wall wall286 = new Wall();
        addObject(wall286,581,530);
        Wall wall287 = new Wall();
        addObject(wall287,599,530);
        Wall wall288 = new Wall();
        addObject(wall288,512,513);
        Wall wall289 = new Wall();
        addObject(wall289,512,498);
        Wall wall290 = new Wall();
        addObject(wall290,511,483);
        removeObject(wall251);
        removeObject(wall250);
        removeObject(wall249);
        removeObject(wall248);
        removeObject(wall247);
        Wall wall291 = new Wall();
        addObject(wall291,258,275);
        Wall wall292 = new Wall();
        addObject(wall292,240,276);
        Wall wall293 = new Wall();
        addObject(wall293,222,276);
        Wall wall294 = new Wall();
        addObject(wall294,204,277);
        Wall wall295 = new Wall();
        addObject(wall295,189,277);
        removeObject(wall244);
        removeObject(wall241);
        addObject(wall241,226,323);
        addObject(wall244,243,324);
        Wall wall296 = new Wall();
        addObject(wall296,384,270);
        Wall wall297 = new Wall();
        addObject(wall297,368,270);
        Wall wall298 = new Wall();
        addObject(wall298,354,270);
        Wall wall299 = new Wall();
        addObject(wall299,354,288);
        Wall wall300 = new Wall();
        addObject(wall300,354,301);
        Wall wall301 = new Wall();
        addObject(wall301,354,316);
        Wall wall302 = new Wall();
        addObject(wall302,354,332);
        Wall wall303 = new Wall();
        addObject(wall303,371,331);
        Wall wall304 = new Wall();
        addObject(wall304,387,331);
        Wall wall305 = new Wall();
        addObject(wall305,404,330);
        Wall wall306 = new Wall();
        addObject(wall306,421,331);
        Wall wall307 = new Wall();
        addObject(wall307,439,331);
        Wall wall308 = new Wall();
        addObject(wall308,458,331);
        Wall wall309 = new Wall();
        addObject(wall309,460,313);
        Wall wall310 = new Wall();
        addObject(wall310,460,294);
        Wall wall311 = new Wall();
        addObject(wall311,460,279);
        Wall wall312 = new Wall();
        addObject(wall312,460,270);
        Wall wall313 = new Wall();
        addObject(wall313,443,270);
        removeObject(wall296);
        wall148.setLocation(513,239);
        wall149.setLocation(511,252);
        wall144.setLocation(510,225);
        removeObject(wall179);
        removeObject(wall184);
        removeObject(wall189);
        removeObject(wall193);
        removeObject(wall198);
        removeObject(wall233);
        removeObject(wall181);
        removeObject(wall182);
        removeObject(wall234);
        removeObject(wall215);
        removeObject(wall207);
        removeObject(wall278);
        removeObject(wall287);
        removeObject(wall147);
        removeObject(wall131);
        wall256.setLocation(258,254);
        wall255.setLocation(256,238);
        wall254.setLocation(254,221);
        Wall wall314 = new Wall();
        addObject(wall314,324,275);
        Wall wall315 = new Wall();
        addObject(wall315,338,273);
        Wall wall316 = new Wall();
        addObject(wall316,476,271);
        Wall wall317 = new Wall();
        addObject(wall317,493,271);
        removeObject(wall165);
        removeObject(wall159);
        ESnake eSnake = new ESnake();
        addObject(eSnake,406,560);
        removeObject(wall315);
        removeObject(wall314);
        removeObject(wall317);
        removeObject(wall316);
        birdStatus.setLocation(406,22);
        removeObject(wall222);
        removeObject(wall221);
        removeObject(wall219);
        removeObject(wall220);
        ESnake eSnake2 = new ESnake();
        addObject(eSnake2,280,299);
        ESnake eSnake3 = new ESnake();
        addObject(eSnake3,515,144);
        ESnake eSnake4 = new ESnake();
        addObject(eSnake4,527,400);
        PohonOak pohonOak = new PohonOak();
        addObject(pohonOak,215,487);
        removeObject(wall194);
        removeObject(wall196);
        removeObject(wall197);
        removeObject(wall195);
        PohonOak pohonOak2 = new PohonOak();
        addObject(pohonOak2,235,99);
        PohonOak pohonOak3 = new PohonOak();
        addObject(pohonOak3,603,463);
        HiddenControls hiddenControls = new HiddenControls(this);
        addObject(hiddenControls,16,18);
        ECat eCat = new ECat();
        addObject(eCat,408,353);
        ECat eCat2 = new ECat();
        addObject(eCat2,527,73);
        ECat eCat3 = new ECat();
        addObject(eCat3,408,451);
        removeObject(eSnake3);
        removeObject(eSnake2);
        removeObject(eSnake);
        removeObject(eSnake4);
        Door door = new Door();
        addObject(door,677,304);
    }
    
    public void makeWalls() {
        int x = 175;
        int x1=x, x2=x;
        int y1=50, y2=585;
        
        for(int i=0;i<27;i++) {
            Wall a = new Wall();
            Wall b = new Wall();
            
            addObject(a,x1,y1);
            addObject(b,x2,y2);
            
            x1=x2+=a.getImage().getWidth()+2;
        }
        
        x1=x;
        
        for(int i=0;i<29;i++) {
            Wall c = new Wall();
            Wall d = new Wall();
            int wall_h = c.getImage().getHeight()+2;
            
            addObject(c,x1,(y1+wall_h));
            
            if(i<12||i>18) addObject(d,x2-18,(y2-wall_h));
            
            y1+=wall_h;
            y2-=wall_h;
        }
    }
}