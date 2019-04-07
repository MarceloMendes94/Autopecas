INSERT INTO tipo_produto (nome) values('rotor'),('regulador'),('rolamento'),('polia'),('bobina');

/*inserindo boninas*/
insert into produto ( modelo , oem      , altura , largura  , comprimento , marca   ,valor  ,numero_peca ,amperagem , diamentro_interno , qte_polos,  fk_tipo_prod)
values              ('J21'   ,08001327  ,150     ,150       ,400          , 'ISKRA' ,96.79  ,4112        ,70         ,90                ,28        ,5),
                    ('J27'   ,08001327  ,100     ,100       ,400          , 'ISKRA' ,156.99 ,4110        ,80         ,90                ,35        ,5),
                    ('J25'   ,08001327  ,250     ,250       ,400          , 'ISKRA' ,96.79  ,4113        ,45         ,90                ,28        ,5),
                    ('J12'   ,08001327  ,350     ,350       ,1000         , 'ISKRA' ,96.79  ,4117        ,45         ,90                ,28        ,5);
/*rolamento*/                    
insert into produto ( modelo , oem      , altura , largura , comprimento , marca   ,valor  ,numero_peca  ,fk_tipo_prod)
values              ('A31'   ,01001200  ,25      ,25       ,40          , 'APEC' ,  7.59    ,0112        ,3),
                    ('A27'   ,01001200  ,15      ,15       ,40          , 'APEC' ,  8.99    ,0110        ,3),
                    ('A25'   ,01001200  ,25      ,25       ,40          , 'APEC' ,  5.25    ,0113        ,3),
                    ('A22'   ,01001200  ,35      ,35       ,40          , 'APEC' ,  13.36   ,0117        ,3);  
/*POLIA*/                    
insert into produto ( modelo    ,oem      , altura , largura , comprimento , marca   ,valor  ,numero_peca ,qte_sulcos ,fk_tipo_prod)
values              ('BB131'    ,02001187  ,75      ,75       ,80          , 'VETOR' ,  37.59 ,7789        ,2          ,4),
                    ('BBA27'    ,02001187  ,45      ,45       ,90          , 'VETOR' ,  38.99 ,7790        ,4          ,4),
                    ('BB125'    ,02001187  ,65      ,65       ,70          , 'VETOR' ,  36.25 ,7788        ,5          ,4),
                    ('BBJ12'    ,02001187  ,95      ,95       ,80          , 'VETOR' ,  25.36 ,7787        ,4          ,4);  
/*ROTOR*/                    
insert into produto ( modelo    ,oem        ,altura , largura , comprimento , marca   ,valor  ,numero_peca ,amperagem   ,diamentro_interno ,voltagem    ,fk_tipo_prod)
values              ('589A'     ,00002356   ,75      ,75       ,80          , 'VETOR' ,  37.59 ,7789       ,25          ,30                ,12          ,1),
                    ('589B'     ,00002356   ,45      ,45       ,90          , 'VETOR' ,  38.99 ,7790       ,25          ,20                ,12          ,1),
                    ('589C'     ,00002356   ,65      ,65       ,70          , 'VETOR' ,  36.25 ,7788       ,25          ,30                ,12          ,1),
                    ('589D'     ,00002356   ,95      ,95       ,80          , 'VETOR' ,  25.36 ,7787       ,21          ,30                ,12          ,1);  
